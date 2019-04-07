/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.* ;

public class Screen implements IScreen, IDisplayComponent
{
    private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>() ;
    private IKeyEventHandler chain ;
    private IKeyEventHandler currentFocus;

    public Screen()
    {
        // no constructor elements
    }

    public void key(String ch, int cnt) {
        currentFocus.key(ch, cnt) ;
    }
    
    public void addSubComponent( IDisplayComponent c )
    {
        components.add( c ) ;
        if (components.size() == 1 )
        {
            chain = (IKeyEventHandler) c ;
            currentFocus = (IKeyEventHandler) c;
        }
        else
        {
            IKeyEventHandler prev = (IKeyEventHandler) components.get(components.size()-2) ;
            prev.setNext( (IKeyEventHandler) c ) ;
        }
    }
    
    public String display() { 
        String value = "" ;
        for (IDisplayComponent c : components )
        {
            value = value + c.display() ;
        }
        return value ; 
    }

    public String name() {
        return (this.getClass().getName()) ;
    }

    public IKeyEventHandler getCurrentFocus() {
        return currentFocus;
    }

    public void setCurrentFocus(IKeyEventHandler iKeyEventHandler) {
        currentFocus = iKeyEventHandler;
    }

}
