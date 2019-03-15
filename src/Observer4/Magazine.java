/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer4;

  public class Magazine extends Subject {
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
        notifyObserver();
    }
    @Override
    protected void notifyObserver() {
        observers.forEach((observer) -> {
            observer.update(number);
      });
    }
}

