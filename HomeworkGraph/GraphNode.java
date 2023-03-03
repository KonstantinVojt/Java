package HomeworkGraph;

import java.util.List;

public class GraphNode {
    List<GraphNode> links;
    String value;

    public GraphNode(List<GraphNode> links, String value) {
        this.links = links;
        this.value = value;
    }

    public List<GraphNode> getLinks() {
        return links;
    }

    public void setLinks(List<GraphNode> links) {
        this.links = links;
    }
}
