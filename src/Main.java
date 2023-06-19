
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String data ="I AM LEARNING JAVA !! ";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();
        try{
           output.write(dataByteArray);
            String newData = output.toString();
            System.out.println("CIKIS : "+newData);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
