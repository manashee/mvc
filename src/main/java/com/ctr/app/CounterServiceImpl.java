package com.ctr.app;


public class CounterServiceImpl implements CounterService {

	private long value = 0L;
	
	@Override
	public long getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	@Override
	public long inc() {
		// TODO Auto-generated method stub
		return ++value;
	}
	
}
