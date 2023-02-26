import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainGraph {
    public static void main(String[] args) {

//        NodeGraph sleep = new NodeGraph(null, null, "Спать");
//        NodeGraph work = new NodeGraph(null, null, "Работать");
//        NodeGraph rest = new NodeGraph(null, null, "Отдыхать");
//        NodeGraph eat = new NodeGraph(null, null, "Есть");
//
//        sleep.setRight(work);
//        work.setRight(rest);
//        rest.setRight(eat);
//        eat.setRight(work);
//
//        sleep.setLeft(rest);
//
//        System.out.println();

        NodeGraphSecond sleep2 = new NodeGraphSecond(null, "Спать");
        NodeGraphSecond work2 = new NodeGraphSecond(null, "Работать");
        NodeGraphSecond rest2 = new NodeGraphSecond(null, "Отдыхать");
        NodeGraphSecond eat2 = new NodeGraphSecond(null, "Есть");
        NodeGraphSecond ill2 = new NodeGraphSecond(null, "Плохое состояние");

        List<NodeGraphSecond> linksFromSleep = new ArrayList<>();
        linksFromSleep.add(work2);
        linksFromSleep.add(rest2);
        linksFromSleep.add(eat2);
        linksFromSleep.add(sleep2);
        sleep2.setLinks(linksFromSleep);


        List<NodeGraphSecond> linksFromWork = new ArrayList<>();
        linksFromWork.add(rest2);
        work2.setLinks(linksFromWork);

        List<NodeGraphSecond> linksFromRest = new ArrayList<>();
        linksFromRest.add(eat2);
        linksFromRest.add(ill2);
        rest2.setLinks(linksFromRest);

        List<NodeGraphSecond> linksFromEat = new ArrayList<>();
        linksFromEat.add(sleep2);
        eat2.setLinks(linksFromEat);

        NodeGraphSecond now = sleep2.getLinks().get(0);

//        now.getLinks().get(1);
//        now.getLinks().get(2);

//        System.out.println(now.value);
//        System.out.println(linksFromSleep.get(0).value);


        NodeGraphSecond one = new NodeGraphSecond(null, "1");
        NodeGraphSecond two = new NodeGraphSecond(null, "2");
        NodeGraphSecond three = new NodeGraphSecond(null, "3");
        NodeGraphSecond four = new NodeGraphSecond(null, "4");
        NodeGraphSecond five = new NodeGraphSecond(null, "5");
        NodeGraphSecond six = new NodeGraphSecond(null, "6");
        NodeGraphSecond all = new NodeGraphSecond(null, "all");

        List<NodeGraphSecond> linksFromOne = new ArrayList<>();
        linksFromOne.add(two);
        linksFromOne.add(three);
        one.setLinks(linksFromOne);

        List<NodeGraphSecond> linksFromTwo = new ArrayList<>();
        linksFromTwo.add(one);
        two.setLinks(linksFromTwo);

        List<NodeGraphSecond> linksFromThree = new ArrayList<>();
        linksFromThree.add(one);
        linksFromThree.add(four);
        linksFromThree.add(five);
        linksFromThree.add(six);
        three.setLinks(linksFromThree);

        List<NodeGraphSecond> linksFromFour = new ArrayList<>();
        linksFromFour.add(three);
        four.setLinks(linksFromFour);

        List<NodeGraphSecond> linksFromFive = new ArrayList<>();
        linksFromFive.add(three);
        linksFromFive.add(six);
        five.setLinks(linksFromFive);

        List<NodeGraphSecond> linksFromSix = new ArrayList<>();
        linksFromSix.add(three);
        linksFromSix.add(five);
        six.setLinks(linksFromSix);

        List<NodeGraphSecond> linksFromAll = new ArrayList<>();
        linksFromAll.add(one);
        linksFromAll.add(two);
        linksFromAll.add(three);
        linksFromAll.add(four);
        linksFromAll.add(five);
        linksFromAll.add(six);
        all.setLinks(linksFromAll);

        System.out.println(linksFromThree.get(3).value);
    }
}
