package it.unibo.radarSystem22.domain.interfaces;

public interface IInteraction2021  {
	  public void forward(  String msg ) throws Exception;
	  public String request(  String msg ) throws Exception;
	  public String receiveMsg(  )  throws Exception;
	  public void reply(  String msg ) throws Exception;
	  public void close( )  throws Exception;
	}
