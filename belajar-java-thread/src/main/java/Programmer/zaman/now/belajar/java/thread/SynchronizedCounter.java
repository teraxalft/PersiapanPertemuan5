package Programmer.zaman.now.belajar.java.thread;

public class SynchronizedCounter {

    private Long value = 0L;
  
    public void increment() {
      synchronized (this) {
        value++;
      }
    }
  
    public Long getValue() {
      return value;
    }
  }