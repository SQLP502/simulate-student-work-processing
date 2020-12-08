# simulate-student-work-processing  
## 实验目的  
掌握字符串String及其方法的使用  
掌握文件的读取/写入方法  
掌握异常处理结构  
## 业务要求  
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。  
文件A包括两部分内容：  
一是学生的基本信息；  
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：  
1、每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”  
2、允许提供输入参数，统计古诗中某个字或词出现的次数  
3、输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A  
4、考虑操作中可能出现的异常，在程序中设计异常处理程序  

## 输入：  
汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>

## 输出：
汉皇重色思倾国，御宇多年求不得。  
杨家有女初长成，养在深闺人未识。  
天生丽质难自弃，一朝选在君王侧。  
回眸一笑百媚生，六宫粉黛无颜色。  
春寒赐浴华清池，温泉水滑洗凝脂。  
侍儿扶起娇无力，始是新承恩泽时。  
云鬓花颜金步摇，芙蓉帐暖度春宵。  
春宵苦短日高起，从此君王不早朝。  
…………  

## 要求：
1、设计学生类（可利用之前的）；  
2、采用交互式方式实例化某学生；  
3、设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。  

## 核心代码  
1、建立学生类，输入学生基本信息，包括姓名、班级、学号、性别等；  
学生类与之前几次实验的相同，可以说是直接拿过来用  
```
public class Student {
	private String class_name;
	private int ID;
	private String name;
	private char sex;
	private int age;
	private String phone_number;
```  
这是对于学生的一些基本信息的声明，也是学生需要输入的信息。  
```
	public void display(){
		System.out.println("班级"+class_name+"\n"+"学号"+ID+"\n"+"姓名"+name+"\n"+"性别"+sex+"\n"+"年龄"+age+"\n"+"电话号码"+phone_number+"\n");
```  
这是输出的学生基本信息。

2、设计Test类，处理文件的输入及输出  
```
public static StringBuffer ReadTxt(String path){
		StringBuffer s = new StringBuffer();
		//读取文件内容
		try{
			FileInputStream out = new FileInputStream(path);
			InputStreamReader iy = new InputStreamReader(out);
			char[] chars = new char[100000];
			int ch = 0;
			int i = 0;
			while((ch = iy.read())!=-1){
				chars[i] = (char)ch;
				i++;
			}
			for (int j = 0;j<i;j++){
				s.append(chars[j]);
				if ((j + 1)% 7 == 0 && (j + 1) % 2 == 0){
					s.append("。" + "\n");
				}
				if((j + 1)% 7== 0 && (j + 1) % 2 != 0){
					s.append(",");
				}
			}
		}catch(Exception e){
			System.out.println("1");
		}
		return s;
	}
```  
```
public String readFile() {
		String original = null;
		int n=-1;
		char[] a = new char[100000];
		try {
			File file = new File("e:\\B.txt");
			InputStream flie = new FileInputStream(file);
			InputStreamReader in = new InputStreamReader(flie, "GBK");
		while((n=in.read(a,0,100))!=-1) {
		String s = new String(a,0,n);
		this.n=n;
		if(original!=null)
		original = original+s;
		else original=s;
		}
		
        in.close();
      	}
		catch (IOException e) {
			System.out.println("File read erroe:"+e);
		}
		return original;
	}
```  
## 实验感想  
本学期最后一个实验了，熟悉了字符串的使用，文件的读取/写入方法，异常处理结构。这次实验也没有做的很好。虽然是课堂上的最后一个实验了，但课后对于Java的学习还会继续的！
