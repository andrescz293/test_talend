package internal;

import routines.DataOperation;
import routines.Mathematical;
import routines.Numeric;
import routines.Relational;
import routines.StringHandling;
import routines.TalendDataGenerator;
import routines.TalendDate;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.conversion;
import routines.system.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

@SuppressWarnings("unused")

public class TalendJavaSourceViewer3 {
	private static java.util.Properties context = new java.util.Properties();
	private static final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
	public void myFunction(){
	  if( 

String fecha_texto = TalendDate.getDate("yyyy_MM_dd_HH_mm_ss");
String foo2 = "bar";


Date fecha_date = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss", TalendDate.getDate("yyyy-MM-dd HH:mm:ss"));



globalMap.put("fecha_date",fecha_date);
globalMap.put("fecha_texto",fecha_texto);

java.util.UUID uuid = java.util.UUID.randomUUID();
String uuidStr = uuid.toString();

globalMap.put("GUID",uuidStr);

globalMap.put("contador_inserts",0);
globalMap.put("contador_updates",0);
globalMap.put("contador_rejects",0);

 
){
	}
	
}
}