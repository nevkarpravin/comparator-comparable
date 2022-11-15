package main;

import java.util.function.Function;

@FunctionalInterface
public interface CustomInterface extends Function {
  default void m1(){

  }
}
