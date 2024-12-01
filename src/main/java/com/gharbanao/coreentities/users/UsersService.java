package com.gharbanao.coreentities.users;

import com.gharbanao.responses.Response;
import com.gharbanao.responses.ResponseConstants;
import com.gharbanao.serviceException.ServiceException;
import com.gharbanao.utility.Utility;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Base64;
import java.util.concurrent.ExecutionException;

@Service
public class UsersService {

    UsersDao usersDao = null;
    UsersService(UsersDao usersDao){
        this.usersDao = usersDao;
    }
    public Response createUser(UsersMaster usersMaster) throws ServiceException, IOException, ExecutionException, InterruptedException {
        byte[] salt = generateSalt();
        String securePassword = hashPassword(usersMaster.getPassword(), salt);
        UsersMaster usersMaster1 = get(usersMaster.getEmailId());
        if(Utility.isNotNull(usersMaster1)){
            return new Response(ResponseConstants.FAILURE, "User Already Exist in System");
        }
        usersMaster.setPassword(securePassword);
        ArrayList<Integer> list = new ArrayList<>();
        for (byte b : salt) {
            list.add(Integer.valueOf(b)); // Auto-boxing from byte to Byte
        }
        usersMaster.setSalt(list);
        return usersDao.createUser(usersMaster);
    }

    public Response updateUser(UsersMaster usersMaster) throws ServiceException, IOException, ExecutionException, InterruptedException {
        UsersMaster currentData = get(usersMaster.getEmailId());
        if(Utility.isNotNull(usersMaster)){
//            byte[] salt = generateSalt();
//            String securePassword = hashPassword(usersMaster.getPassword(), salt);
//            usersMaster.setPassword(securePassword);
            return usersDao.updateUser(usersMaster);
        } else {
            return new Response(ResponseConstants.FAILURE, "Users Dosent Exist");
        }

    }

    public static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16]; // 128-bit salt for good security
        random.nextBytes(salt);
        return salt;
    }

    public static String hashPassword(String password, byte[] salt) {
        String securePassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt);
            byte[] hashedBytes = md.digest(password.getBytes());
            securePassword = Base64.getEncoder().encodeToString(hashedBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return securePassword;
    }

    public UsersMaster get(String emailId) throws ServiceException, IOException, ExecutionException, InterruptedException {
        return usersDao.getUser(emailId);
    }

    public Response login(UsersMaster usersMaster) throws ServiceException, IOException, ExecutionException, InterruptedException {
        System.out.println("user master " + usersMaster.toString());
        UsersMaster master = get(usersMaster.getEmailId());
        if(Utility.isNotNull(master)){
            ArrayList<Integer> salt = master.getSalt();
            byte[] byteArray = new byte[salt.size()];
            for (int i = 0; i < salt.size(); i++) {
                byteArray[i] = Byte.valueOf(salt.get(i).toString()); // Auto-unboxing from Byte to byte
            }
            String securePassword = hashPassword(usersMaster.getPassword(), byteArray);
            System.out.println("Password " + securePassword);
            if(!securePassword.equals(master.getPassword())){
                return new Response(ResponseConstants.SUCCESS, "Password Doesn't Match");
            }
        }
        return new Response(ResponseConstants.SUCCESS, master, "User Logged In");
    }
}
