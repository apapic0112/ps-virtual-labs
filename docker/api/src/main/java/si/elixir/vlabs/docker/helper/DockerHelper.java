package si.elixir.vlabs.docker.helper;

import si.elixir.vlabs.docker.Container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DockerHelper {

    private static List<Container> active = new ArrayList<Container>(Arrays.asList(
            new Container(1132, "029d0c2f4fff", "course-unix-linux-cmd-ff31ac", 1513017335, "UnixLinuxCMD", "Running"),
            new Container(1135, "66636c3eec00", "course-unix-linux-cmd-ff59dd", 1513017449, "UnixLinuxCMD", "Running"),
            new Container(1173, "dbb356066466", "course-unix-linux-cmd-ffaa12", 1513017956, "UnixLinuxCMD", "Running"),
            new Container(1200, "03ed353e3e28", "course-unix-linux-cmd-ffab67", 1513018256, "UnixLinuxCMD", "Running"),
            new Container(1202, "3ebb3065283e", "course-unix-linux-cmd-ffff99", 1513019257, "UnixLinuxCMD", "Running")
    ));

    public static List<Container> getActive() {
        return active;
    }

    public static List<Container> getById(int id) {
        List<Container> result = new ArrayList<>();
        for(Container c : active) {
            if (c.getId() == id) {
                result.add(c);
                break;
            }
        }
        return result;
    }
}
