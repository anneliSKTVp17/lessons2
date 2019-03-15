/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer4;

    public class MagazineSubscriber implements Observer {
    private int magazineNumber;
    public int getMagazineNumber() {
        return magazineNumber;
    }
    @Override
    public void update(int magazineNumber) {
        this.magazineNumber = magazineNumber;
    }
} 

