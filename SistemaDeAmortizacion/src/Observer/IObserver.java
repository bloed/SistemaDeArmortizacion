package Observer;

public interface IObserver {
  public <T> void update(T dto);
}
