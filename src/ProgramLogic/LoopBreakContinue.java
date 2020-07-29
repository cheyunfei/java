package ProgramLogic;
/**（1）break一般只跳出最内层循环<br>
 * （2）“标签：循环体 { break 标签 }”可以跳出任意循环<br>
 * （3）continue跳出一次循环，不执行后续代码，然后修整变量开始下一次循环<br>
 * （4）“标签：循环体{ continue 标签 }”,当循环体只有一层时，标签作用和没有时一样，当循环体有多层，
 *            对于continue所在的层来说标签作用和break相同，但是继续标签所指定循环位置的下一次循环<br>
 * */
public class LoopBreakContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (j == 4) {// 如果j等于4的时候就结束内部循环
					break;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
		
		
		Loop: for (int i = 0; i < 3; i++) {// 在for循环前用标签标记
			for (int j = 0; j < 6; j++) {
				if (j == 4) {// 如果j等于4的时候就结束外层循环
					break Loop;// 跳出Loop标签标记的循环体
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
		
		
		loop:for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (j == 4) {// 如果j等于4的时候就结束内部循环
					continue loop;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
		
		
		
	}
}