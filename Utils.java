import java.security.MessageDigest;

public class Utils {
    private static MessageDigest CRIP_HASH;
    private static final String PADRAO_UTF = "UTF-8";

    public static void geraChaveSha(String CHAVE, String TEXTO) throws Exception {
        if (!(CHAVE.equalsIgnoreCase("SHA-1") || CHAVE.equalsIgnoreCase("SHA-2") || CHAVE.equalsIgnoreCase("SHA-3"))) {
            System.out.println("Não identificamos qual desejaria, então, vamos entrar com o algoritmo SHA-1!");
            CHAVE = "SHA-1";
        }
        switch (CHAVE) {
            case "SHA-1":
                CHAVE = "SHA-1";
            case "SHA-2":
                CHAVE = "SHA-256";
            case "SHA-3":
                CHAVE = "SHA3-256";
        }

        CRIP_HASH = MessageDigest.getInstance(CHAVE); //lib para criptografia Hash
        byte[] hash = CRIP_HASH.digest(TEXTO.getBytes(PADRAO_UTF)); //Necessário transformar em bites, pois os algoritmos de hash trabalham em bytes

        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0'); // Garantir que sempre tenha dois dígitos
            hexString.append(hex);
        } // Converter o hash gerado em byte para hexadecimal

        System.out.println("HASH GERADO COM O SEGUINTE VALOR: " + hexString.toString());
    }
}

