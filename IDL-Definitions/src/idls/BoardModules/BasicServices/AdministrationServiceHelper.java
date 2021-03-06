package BoardModules.BasicServices;


/**
* BoardModules/BasicServices/AdministrationServiceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BoardModules.idl
* Dienstag, 15. Dezember 2015 18:00 Uhr MEZ
*/

abstract public class AdministrationServiceHelper
{
  private static String  _id = "IDL:BoardModules/BasicServices/AdministrationService:1.0";

  public static void insert (org.omg.CORBA.Any a, BoardModules.BasicServices.AdministrationService that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static BoardModules.BasicServices.AdministrationService extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (BoardModules.BasicServices.AdministrationServiceHelper.id (), "AdministrationService");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static BoardModules.BasicServices.AdministrationService read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AdministrationServiceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, BoardModules.BasicServices.AdministrationService value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static BoardModules.BasicServices.AdministrationService narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof BoardModules.BasicServices.AdministrationService)
      return (BoardModules.BasicServices.AdministrationService)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      BoardModules.BasicServices._AdministrationServiceStub stub = new BoardModules.BasicServices._AdministrationServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static BoardModules.BasicServices.AdministrationService unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof BoardModules.BasicServices.AdministrationService)
      return (BoardModules.BasicServices.AdministrationService)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      BoardModules.BasicServices._AdministrationServiceStub stub = new BoardModules.BasicServices._AdministrationServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
