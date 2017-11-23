package si.elixir.vlabs.docker.helper;


import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerCertificateException;
import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.DockerException;

public class DockerHelper {

    private DockerHelper() {}

    public static void getContainerStatuses() {
        try {
            DockerClient client = DefaultDockerClient.fromEnv().build();
            client.info();

        } catch (DockerCertificateException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (DockerException e) {
            e.printStackTrace();
        }
    }
}
