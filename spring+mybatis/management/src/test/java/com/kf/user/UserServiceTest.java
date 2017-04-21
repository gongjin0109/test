package com.kf.user;

import com.kf.JunitBaseConfig;
import com.kf.model.User;
import com.kf.service.impl.UserService;
//import com.qhfax.core.security.TriperDESCipher;
import net.sf.json.JSONArray;
import org.apache.log4j.Logger;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * User:gongJin
 * Date:2017/3/3 0003
 * Time:13:48
 */
public class UserServiceTest extends JunitBaseConfig<UserServiceTest> {

	Logger logger = Logger.getLogger(UserServiceTest.class);

	@Resource
	private UserService userService;

//	@Test
//	public void test1(){
//		User user =null;
//		int result = 0;
//		for (int i = 10 ;i < 15 ; i++){
//			user = new User();
//			user.setUserId("U14836"+i+"63144260");
//			user.setUserName("188118"+i+"994");
//			user.setMobilePhone("PoWmqJPc5rs3avdmawXL24="+i);
//			user.setUserPassword("7b6aeaf6bd9c315f006a101050d12dd5");
//			user.setRoleMark("3");
//			user.setCreateTime("2017-03-03 00:00:00");
//			user.setSalt("d23ac4");
//			user.setIsCheckPhone(1);
//			user.setIsCheckEmail(0);
//			user.setDeleted(false);
//			user.setWechatId("oC23Tw-9bM9IJSHp7ilpDFGxQ9q"+i);
//			result += userService.addUser(user);
//		}
//		System.out.print(result);
//	}

	@Test
	public void test2(){
		List<User> list = userService.selectAllUserInfo();
		System.out.print(JSONArray.fromObject(list).toString());
	}

//	@Test
//	public void test3(){
//		User user = new User();
//		user.setUserId("U148361163144260");
//		user.setMobilePhone("Po");
//		user.setIsCheckEmail(1);
//		user.setIsCheckPhone(0);
//		int result = userService.updateUserInfoByUserId(user);
//		System.out.print("修改返回结果:"+result);
//	}

//	@Test
//	public void test4(){
//		System.out.println("加密返回结果:"+TriperDESCipher.encrypt("421024199307053475"));
//		System.out.println("解密返回结果:"+TriperDESCipher.decrypt("PoWmqJPc5rs3avdmawXL2g=="));
//		User user = new User();
//		user.setUserId("U148361263144260");
//		user.setDeleted(true);
//		int result = userService.updateUserInfoByUserId(user);
//		System.out.println("修改返回结果:"+result);

//		System.out.println(TriperDESCipher.encrypt("421023199201098599"));
//
//		String str ="http://localhost:6060/image/banner/1489634326763.png";
//		String result = "";
//		int i = 0;
//		while(i < 2) {
//			int lastFirst = str.lastIndexOf('/');
//			result = str.substring(lastFirst) + result;
//			str = str.substring(0, lastFirst);
//			i++;
//		}
//		result = result.substring(1);
//		System.out.println(result);
//	}

}
