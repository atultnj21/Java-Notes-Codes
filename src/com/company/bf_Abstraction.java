/* Abstraction( second principle of OOP)
   Reduce complexity by hiding unnecessary
   details in our classes */

/* Coupling:
  The level of dependency between classes
  i.e. how much a class is dependent upon
  or coupled to another class */

/* We want to reduce coupling between classes
   there is no such thing as no coupling or
   zero coupling , there is always coupling
   we just aim to reduce coupling

   if we don't require some methods it's better
   to hide or delete them because the more methods
   a class provide the more other classes are going
   to get coupled to it */


package com.company;

class Browser{

    public void navigate(String address){
        String ip =findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    // our main class does not really care about these 2 methods
    //so we keep them private , these are implementation details
    private String sendHttpRequest(String ip) {
        return  "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }


}
public class bf_Abstraction {
    public static void main(String[] args) {
        var browser = new Browser();
        browser.navigate("google");
    }
}
