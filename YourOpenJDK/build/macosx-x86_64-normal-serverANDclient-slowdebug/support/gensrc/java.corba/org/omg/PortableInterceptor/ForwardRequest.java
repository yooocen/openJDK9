package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ForwardRequest.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/chenyongda/YourOpenJDK/corba/src/java.corba/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Sunday, February 25, 2018 at 1:52:15 AM China Standard Time
*/

public final class ForwardRequest extends org.omg.CORBA.UserException
{

  /** 
       * The new object to forward the request to.
       */
  public org.omg.CORBA.Object forward = null;

  public ForwardRequest ()
  {
    super(ForwardRequestHelper.id());
  } // ctor

  public ForwardRequest (org.omg.CORBA.Object _forward)
  {
    super(ForwardRequestHelper.id());
    forward = _forward;
  } // ctor


  public ForwardRequest (String $reason, org.omg.CORBA.Object _forward)
  {
    super(ForwardRequestHelper.id() + "  " + $reason);
    forward = _forward;
  } // ctor

} // class ForwardRequest