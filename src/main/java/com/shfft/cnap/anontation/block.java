/**
 * www.bplow.com
 */
package com.shfft.cnap.anontation;

import com.shfft.cnap.enums.Type;

/**
 * @desc 
 * @author wangxiaolei
 * @date 2018年11月4日 上午11:58:07
 */
public @interface block {
	
	public int index = 0;
	
	public int lenght = 0;
	
	public Type type = Type.STRING;
	
	public String offset="L";

	
}
