import java.util.List;

public class NodeGraphSecond {

//    NodeGraphSecond first;
//    NodeGraphSecond second;
//    NodeGraphSecond third;

    List<NodeGraphSecond> links;
    String value;

    public NodeGraphSecond(List<NodeGraphSecond> links, String value) {
        this.links = links;
        this.value = value;
    }

    public List<NodeGraphSecond> getLinks() {
        return links;
    }

    public void setLinks(List<NodeGraphSecond> links) {
        this.links = links;
    }

//    public String get(int index) {
//        return value;
//    }
}
