package com.testing.class6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ipResult = "{\"status\":\"0\",\"t\":\"1556114489842\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"美国\",\"titlecont\":\"IP地址查询\",\"origip\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.3.3.3\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.3.3.3\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]}";
		// 创建一个json格式的对象，内容就是ipResult的内容
		try {
			// 将字符串或者其它格式，解析成为无序存放的json格式字符串
			JSONObject ipJson = new JSONObject(ipResult);
			System.out.println("json格式的内容：" + ipJson);
			// 通过json.get方法获取某个键的值
			System.out.println("data键的值：" + ipJson.get("data"));
			// 将json当中的内容转存到map里面
			Map<String, String> ipMap = new HashMap<String, String>();
			// 遍历获取json格式中的所有键以及对应的值，注意方法名是keys，获取迭代器
			Iterator<String> jsonIt = ipJson.keys();
			while (jsonIt.hasNext()) {
				String jsonKey = jsonIt.next();
				// 添加到map中,统一用string来进行存储，所以不管什么格式，通通toString
				ipMap.put(jsonKey, ipJson.get(jsonKey).toString());
			}
			System.out.println("map格式的内容：" + ipMap);

			// 为了熟悉map和string方法的使用，将map中的键值对重新拼接成为一个Json格式的字符串
			String map2Json = "{";
			// 遍历map中的所有内容
			Set<String> mapKey = ipMap.keySet();
			// 遍历操作中，存在两种场景，一种是普通的键值对，格式是"键":"值"，另一种以[{开头，格式就是“键”：[{}],
			for (String key : mapKey) {
				if (ipMap.get(key).startsWith("[{")) {
					// 如果值以[{开头，那么拼接的方式是“ + 键 + ” ：+ 值 +,
					map2Json += "\"" + key + "\":" + ipMap.get(key) + ",";
				} else {
					// 如果值不以[{开头，那么是普通的键值对，拼接的时候拼接" +键+":"+值+",
					map2Json += "\"" + key + "\":\"" + ipMap.get(key) + "\",";
				}
			}
			// 拼接完成之后，最后一个键值对之后会多一个逗号，将它换成}
			// 取map2Json的子字符串的方式，去掉最后一个逗号
			map2Json = map2Json.substring(0, map2Json.length() - 1);
			// 加上最后的}，完成拼接
			map2Json += "}";
			System.out.println("拼接完成之后的json字符串" + map2Json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
