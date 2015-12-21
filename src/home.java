
import java.util.ArrayList;
import java.util.ListIterator;
abstract class Component {
	abstract void print();
}

class Composite extends Component {
	ArrayList<Component> list;

	public Composite() {
		list = new ArrayList<Component>();
	}

	public void addComponent(Component c) {
		list.add(c);
	}

	void print() {
		ListIterator<Component> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Component c = iterator.next();
			c.print();
		}
	}
}

class Question extends Component {
	String description;

	public Question(String desc) {
		this.description = desc;
	}

	public void print() {
		System.out.println(description);
	}
}
class chance extends Component{
	String description;

	public chance(String desc) {
		this.description = desc;
	}

	public void print() {
		System.out.println(description);
	}
}

public class home {

	public static void main(String[] args) {
		Composite paper = new Composite();
		Composite com = new Composite();
		com.addComponent(new Question("Ex 1:在Composite設計樣式中，不包含哪一個角色"));
		com.addComponent(new chance("(a)component\n(b)leaf\n(c)composite\n(d)decorator\n"));
		com.addComponent(new Question("Ex 2:在Composite設計樣式中，composite角色（複選）"));
		com.addComponent(new chance("(a)是component的子類別\n(b)可以包含許多component\n(c)具備addComponent()的功能\n(d)收到client訊息後，會轉給所有它包含的component\n"));
		paper.addComponent(com);
		paper.print();
		System.out.println("D0247705");
	}
}