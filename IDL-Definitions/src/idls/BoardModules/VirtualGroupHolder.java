package BoardModules;

/**
* BoardModules/VirtualGroupHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BoardModules.idl
* Dienstag, 15. Dezember 2015 18:00 Uhr MEZ
*/

public final class VirtualGroupHolder implements org.omg.CORBA.portable.Streamable
{
  public BoardModules.VirtualGroup value = null;

  public VirtualGroupHolder ()
  {
  }

  public VirtualGroupHolder (BoardModules.VirtualGroup initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BoardModules.VirtualGroupHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BoardModules.VirtualGroupHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BoardModules.VirtualGroupHelper.type ();
  }

}
