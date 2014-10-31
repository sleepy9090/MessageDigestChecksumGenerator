/*
 * Copyright (c) Shawn M. Crawford All Rights Reserved.
 */

package md5generator;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shawn M. Crawford
 */
public class MD5Generator {
    
    private static final Logger logger = Logger.getLogger(MD5GeneratorUI.class.getName());
    
    public MD5Generator() {
        
    }

    public String generateFileMD5Checksum(String algorithm, String filePath) {
        String checksum = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            MessageDigest md = MessageDigest.getInstance(algorithm);

            byte[] buffer = new byte[8192];
            int numOfBytesRead;
            while((numOfBytesRead = fis.read(buffer)) > 0) {
                md.update(buffer, 0, numOfBytesRead);
            }
            byte[] hash = md.digest();
            checksum = new BigInteger(1, hash).toString(16);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            logger.log(Level.SEVERE, null, ex);
        }

       return checksum;
    }
}
