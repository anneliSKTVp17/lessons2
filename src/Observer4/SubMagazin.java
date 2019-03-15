/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer4;

public class SubMagazin {
public static void main(String[] args) {  
    Magazine magazine = new Magazine();
MagazineSubscriber pokupatel1 = new MagazineSubscriber();
MagazineSubscriber pokupatel2 = new MagazineSubscriber();
MagazineSubscriber pokupatel3 = new MagazineSubscriber();

magazine.attach(pokupatel1);
magazine.attach(pokupatel2);
magazine.attach(pokupatel3);

 magazine.setNumber(1);
System.out.println("Pokupatel 1 Magazine number " + pokupatel1.getMagazineNumber());
System.out.println("Pokupatel 2 Magazine number " + pokupatel2.getMagazineNumber());
System.out.println("Pokupatel 3 Magazine number " + pokupatel3.getMagazineNumber());

magazine.detach(pokupatel3);
magazine.setNumber(2);
System.out.println("Pokupatel 1 Magazine number " + pokupatel1.getMagazineNumber());
System.out.println("Pokupatel 2 Magazine number " + pokupatel2.getMagazineNumber());
System.out.println("Pokupatel 3 Magazine number " + pokupatel3.getMagazineNumber());
}
}

