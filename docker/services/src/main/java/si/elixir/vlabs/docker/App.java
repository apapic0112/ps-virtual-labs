package si.elixir.vlabs.docker;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.ListContainersCmd;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.core.DockerClientBuilder;

import java.util.List;

public class App {

    public static void main(String[] args) {
        DockerClient instance = DockerClientBuilder.getInstance().build();

        // "running"
        ListContainersCmd running = instance.listContainersCmd().withShowAll(true);
        List<Container> containers = running.exec();

        System.out.print("");
    }
}
