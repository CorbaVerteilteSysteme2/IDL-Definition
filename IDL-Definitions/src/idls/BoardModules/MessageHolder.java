package BoardModules;

/**
* BoardModules/MessageHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BoardModules.idl
* Dienstag, 15. Dezember 2015 18:00 Uhr MEZ
*/

public final class MessageHolder implements org.omg.CORBA.portable.Streamable
{
  public BoardModules.Message value = null;

  public MessageHolder ()
  {
  }

  public MessageHolder (BoardModules.Message initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BoardModules.MessageHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BoardModules.MessageHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BoardModules.MessageHelper.type ();
  }

}
