package Transport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Car extends Abstract {
    public Car(){
    	transname="汽车";
    	SimpleDateFormat dateformate=new SimpleDateFormat("yyyy-MM-dd HH:mm");//java中HH代表24小时制，hh是12小时制
        SimpleDateFormat dateformat=new SimpleDateFormat("HH:mm");//MM代表月份，mm代表分钟
    	try {
    		   setofftime=dateformate.parse("2018-10-06 08:30");
    		   returntime=dateformate.parse("2018-10-06 09:30");
    		   picktime=dateformate.parse("2018-10-06 07:30");
    		   securitytime=dateformate.parse("2018-10-06 08:00");
    		   waittime=dateformat.parse("00:10");
    	}catch(ParseException e) {
    	   e.printStackTrace();
    	   }
    	speed=80;
    	unitprice=0.32;
    }
    	
		/*SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
		try {
			  setofftime=dateFormat.parse("00:10:00");
			  returntime=dateFormat.parse("00:10:00");
			  picktime=dateFormat.parse("00:05:00");
			  securitytime=dateFormat.parse("00:05:00");
			  waittime=dateFormat.parse("00:20:00");
		}catch (ParseException e) {
			e.printStackTrace();
		}
		speed=100;
		unitprice=0.32;
    */


	@Override //重写方法
	public
	ArrayList<String> cost(String departure, String destination, double distance) {
		// TODO Auto-generated method stub
		double money=distance*unitprice;
		double time=distance/speed;
		double time_m=(time-(int)time)*60;
		double time_s=(time_m-(int)time_m)*60;
	    String hour=String.valueOf((int)time);
	    String minute=String.valueOf((int)time_m);
	    String second=String.valueOf((int)time_s);
	    SimpleDateFormat dateformat=new SimpleDateFormat("HH:mm:ss"); 
		Date times=null;
		try {
			   times=dateformat.parse(hour+":"+minute+":"+second);
		}catch(ParseException e) {
		       e.printStackTrace();
		}
		ArrayList<String>list=new ArrayList<String>();
		list.add(dateformat.format(times));
		list.add(String.valueOf(money));
		return list;
	}

}
