

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 

public class Mapper41 extends Mapper<LongWritable, Text, NullWritable, NullWritable> {
	
	public void map(LongWritable key, Text value,Context context) 
			throws IOException, InterruptedException {
		try {
		String[] lineArray = value.toString().split(",");
		String NA = new String("NA");
		
		if((lineArray[0].equalsIgnoreCase(NA))||(lineArray[1].equalsIgnoreCase(NA)))
		{
			
			
		}
		else
		{
			context.write(NullWritable.get(),NullWritable.get());
		}
		
			}catch (ArrayIndexOutOfBoundsException e){System.out.println("caught");}
	  }
	}
