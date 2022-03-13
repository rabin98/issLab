package it.unibo.radarSystem22.domain.interfaces;

import it.unibo.is.interfaces.IObserver;

public interface ISonarObservable  extends ISonar{
	  void register( IObserver obs );
	  void unregister( IObserver obs );
}
