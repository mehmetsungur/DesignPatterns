package StructuralDP.FacadeDP;

public class Runner {
    public static void main(String[] args) {
        String text = "Design Pattern";

        AES_Enc aesEnc = new AES_Enc();
        aesEnc.encrypt(text);

        SHA_Enc shaEnc = new SHA_Enc();
        shaEnc.encrypt(text, "ms");

        MD5_Enc md5Enc = new MD5_Enc();
        md5Enc.encrypt(text, "ms", true);

        MD5_Enc md5EncFalse = new MD5_Enc();
        md5EncFalse.encrypt(text, "ms", false);

        System.out.println("------------------------------");

        EncryptoFacade encryptoFacade = new EncryptoFacade();
        encryptoFacade.encrypt(text,EncryptorType.AES);
        encryptoFacade.encrypt(text,EncryptorType.SHA);
        encryptoFacade.encrypt(text,EncryptorType.MD5);
    }
}
