package com.atguigu.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {// 注意这个方法名不能和类名相同
//		return new RandomRule();// 随机策略
//		return new RoundRobinRule(); // 轮询策略
//		return new RetryRule(); // 服务正常的时候等同于轮询策略，有一个服务不正常的时候，切割掉出错的服务，继续访问正常的服务。
		return new RandomRule_ZY();// 我自定义为每台机器5次
	}

}
