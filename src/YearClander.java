import javax.swing.JOptionPane;
import java.awt.*;
import java.util.*;

public class YearClander {

	public static int TotalDay(int[] value) {
		int day = value[0], month = value[1], year = value[2];

		int leap_year = year / 4 - year / 100 + year / 400;

		// 處理天數
		int total_day = day;

		// 處理月數
		for (int i = 1; i < month; i++) {

			total_day = total_day + MonthDay(i);
		}

		// 處理年數
		total_day = total_day + (year - 1) * 365;

		// 加上 潤年的時間 非閏年 365天 潤年366天
		total_day = total_day + leap_year;

		// 特殊年月 1752 9月1,2,14,15...，會有問題 如果 輸入為 3/9/1752 OR 當年以後月份會有問題
		if (year > 1752) {
			total_day = total_day - 12;
		}

		return total_day;
	}

	public static int MonthDay(int i) {
		int num = 0;

		switch (i) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8: // case 後面只能接不能變動的值
		case 10:
		case 12:
			num = 31;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			num = 30;
			break;

		case 2:
			num = 28;
			break;

		default:
			System.out.println("Error:超出月份範圍 :" + i);
			break;
		}

		return num;
	}

	public static int DayUse(int[] date_num) {
		// 判斷過去所有天數
		int total_day = TotalDay(date_num);

		int judge_day = total_day % 7;

		int num = 0;

		// System.out.println(judge_day);

		switch (judge_day) {
		case 1:
			num = 6;
			System.out.print("星期六\t");
			break;

		case 2:
			num = 7;
			System.out.print("星期日\t");
			break;

		case 3:
			num = 1;
			System.out.print("星期一\t");
			break;

		case 4:
			num = 2;
			System.out.print("星期二\t");
			break;

		case 5:
			num = 3;
			System.out.print("星期三\t");
			break;

		case 6:
			num = 4;
			System.out.print("星期四\t");
			break;

		case 0:
			num = 5;
			System.out.print("星期五\t");
			break;
		}

		return num;
	}

	public static void YearUse(int[] date_num) {

	}

	public static void MonthUse(int[] date_num) {
		// 判斷是否為1752/9 此為特殊月份單獨輸出
		if (date_num[1] == 1752 && date_num[0] == 9) {
			System.err.print("UNDONE");
		}

		// 先得到該月1號為星期幾
		int[] date = new int[3];

		date[0] = 1;
		date[1] = date_num[0];
		date[2] = date_num[1];

		int j = 1;

		for (int i = 1; i < MonthDay(date[1]) + 1; i++) {
			
			if(i ==1)
			{
				int total_day = TotalDay(date);

				int judge_day = total_day % 7;

				for(int z = 0;z<judge_day;z++)
				{
					System.out.print("\t");
					
				}
			}
			
			date[0] = i;			
			DayUse(date);

			if (i % 7 == 0) {
				System.out.print("\n");
				
			}
		}

	}

	public static int[] DateToInt(String date) {
		// TODO:處理輸入並非為格式
		{

		}

		char[] datechar = date.toCharArray();
		String a = "";

		int[] datanum = new int[3];

		// ArrayList<Integer> datanum = new ArrayList<Integer>();

		int k = 0;

		for (int i = 0; i < datechar.length; i++) {
			if (datechar[i] == '/') {
				datanum[k] = Integer.parseInt(a);
				a = "";
				k++;
			} else {
				a += datechar[i];
			}
		}

		datanum[k] = Integer.parseInt(a);

		return datanum;
	}

	public static void main(String[] args) {

		String date = JOptionPane.showInputDialog("請輸入 日/月/年");

		// date_num[0] = day , [1] = month, [2] = year
		int[] date_num = DateToInt(date);

		if (date_num[1] == 0) {
			// 需取出整年的年曆
			YearUse(date_num);

		} else if (date_num[2] == 0) {
			// 需得到整月的月曆
			MonthUse(date_num);

		} else {
			DayUse(date_num);
		}
		// 顯示排版
		// String month = Integer.toString(date_num[1]);
	}
}
