/* Divide big interfaces into smaller ones */
package com.company;

interface Resize{
    void resize();
}

interface Draggable{
    void drag();
}

interface UIWidget extends Resize,Draggable{
//    void drag();
//    void resize();
    void render();
}

class implementUIWidget implements UIWidget{
    public void drag(){
        System.out.println("implemented");
    }
    public void render(){

    }
    public void resize(){

    }
}
class Dragger{
    public void drag(UIWidget dragg){
        dragg.drag();
        System.out.println("Dragging done");
    }
}

public class by_InterfaceSegregation {
    public static void main(String[] args) {
        UIWidget dragg=new implementUIWidget();
        Dragger d = new Dragger();
        d.drag(dragg);
        /*
        implemented
        Dragging done
         */
    }
}
