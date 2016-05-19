/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author fm010
 */
public interface ISubject {
  public void attach(IObserver observer);
  public void detach(IObserver observer);
  public void notifyObservers();
}
