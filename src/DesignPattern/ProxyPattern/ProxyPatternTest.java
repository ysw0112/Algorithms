package DesignPattern.ProxyPattern;

public class ProxyPatternTest {
  public static void main(String[] args) {
    CommandExecutor executor = new CommandExecutorProxy("yang-yeongman", "is_not_pw");
    try{
      executor.runCommand("ls -al");
      executor.runCommand("ps -ef | grep linkback");
    }catch (Exception e){
      System.out.println("exception : "+ e.getMessage());
    }
  }
}
