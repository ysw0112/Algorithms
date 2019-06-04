package DesignPattern.ProxyPattern;

public class CommandExecutorProxy implements CommandExecutor {
  private boolean isAdmin;
  private CommandExecutor executor;

  public CommandExecutorProxy(String user, String pwd){
    if("yang-yeongman".equals(user) && "cjstk1004".equals(pwd)){
      isAdmin = true;
    }
    executor = new CommandExcutorImpl();
  }
  @Override
  public void runCommand(String cmd) throws Exception {
    if(isAdmin){
      executor.runCommand(cmd);
    }else{
      if(cmd.trim().startsWith("ps")){
        throw new Exception("ps is no");
      }else{
        executor.runCommand(cmd);
      }
    }
  }
}
