package Thread;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ThreadSafeDemo2 implements Runnable{
	 private List<String> list;

	    public ThreadSafeDemo2(List<String> list){
	        this.list = list;
	    }

	    @Override
	    public void run() {
	    	synchronized(this) {
	        while(true) {
	            list.add("版权归作者所有，任何形式转载请联系作者。作者：KY主创们（来自豆瓣来源：https://www.douban.com/note/630084526/不过，专门研究“人猫交流（cat-human communication)”的学者认为这种印象也不完全是精确的——是的，这是一个真实存在的研究学科。研究宠物行为的学科曾经一度被取消，因为人们认为这种研究的本质是一种拟人论（anthropomorphism），但现在研究这个学科的学者已经不再这样认为了（即宠物行为研究有其自身本质的意义）。");
	            System.out.println("添加一个后尺寸："+list.size());
	            try {
	            	//Thread.sleep(5*1000);
	            	TimeUnit.MILLISECONDS.sleep(5000);  //TimeUnit的睡眠是Thread的高级睡眠形式，比其更加清楚了解睡眠的时长
				} catch (InterruptedException e){
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    }
	  }
	}


