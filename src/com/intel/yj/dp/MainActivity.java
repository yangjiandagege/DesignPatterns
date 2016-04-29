package com.intel.yj.dp;


import com.intel.yj.designpatterns.R;
import com.intel.yj.dp.abstractfactory.AbstractFactoryApp;
import com.intel.yj.dp.adapter.AdapterApp;
import com.intel.yj.dp.bridge.BridgeApp;
import com.intel.yj.dp.builder.BuilderApp;
import com.intel.yj.dp.businessdelegate.BusinessDelegateApp;
import com.intel.yj.dp.callback.CallbackApp;
import com.intel.yj.dp.chainofresponsibility.ChainOfResponsibilityApp;
import com.intel.yj.dp.command.CommandApp;
import com.intel.yj.dp.composite.CompositeApp;
import com.intel.yj.dp.dao.DataAccessObjectApp;
import com.intel.yj.dp.decorator.DecoratorApp;
import com.intel.yj.dp.facade.FacadeApp;
import com.intel.yj.dp.factory.FactoryApp;
import com.intel.yj.dp.factorymethod.FactoryMethodApp;
import com.intel.yj.dp.filter.FilterApp;
import com.intel.yj.dp.fyweight.FlyweightApp;
import com.intel.yj.dp.interpreter.InterpreterApp;
import com.intel.yj.dp.iterator.IteratorApp;
import com.intel.yj.dp.mediator.MediatorApp;
import com.intel.yj.dp.memento.MementoApp;
import com.intel.yj.dp.mvc.ModelViewControllerApp;
import com.intel.yj.dp.nullobject.NullObjectApp;
import com.intel.yj.dp.observer.ObserverApp;
import com.intel.yj.dp.prototype.PrototypeApp;
import com.intel.yj.dp.proxy.ProxyApp;
import com.intel.yj.dp.singleton.SingletonApp;
import com.intel.yj.dp.state.StateApp;
import com.intel.yj.dp.strategy.StrategyApp;
import com.intel.yj.dp.template.TemplateApp;
import com.intel.yj.dp.threadpool.ThreadPoolApp;
import com.intel.yj.dp.visitor.VisitorApp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

public class MainActivity extends BaseActivity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void observer(View view){
		ObserverApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}

	public void singleton(View view){
		SingletonApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}

	public void adapter(View view){
		AdapterApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}

	public void callback(View view){
		CallbackApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}

	public void command(View view){
		CommandApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}

	public void proxy(View view){
		ProxyApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void threadpool(View view){
		ThreadPoolApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}

	public void factorymethod(View view){
		FactoryMethodApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void businessdelegate(View view){
		BusinessDelegateApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void decorator(View view){
		DecoratorApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void state(View view){
		StateApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void mediator(View view){
		MediatorApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void facade(View view){
		FacadeApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void builder(View view){
		BuilderApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void chainOfResponsibility(View view){
		ChainOfResponsibilityApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void modelViewController(View view){
		ModelViewControllerApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void visitor(View view){
		VisitorApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void flyweight(View view){
		FlyweightApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void dataAccessObject(View view){
		DataAccessObjectApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void abstractFactory(View view){
		AbstractFactoryApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void prototype(View view){
		PrototypeApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void bridge(View view){
		BridgeApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void factory(View view){
		FactoryApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void filter(View view){
		FilterApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void composite(View view){
		CompositeApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	public void interpreter(View view){
		InterpreterApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void iterator(View view){
		IteratorApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void memento(View view){
		MementoApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void nullobject(View view){
		NullObjectApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void strategy(View view){
		StrategyApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
	
	public void template(View view){
		TemplateApp.test();
		Util.showResultDialog(MainActivity.this, Result.mResult,"Result");
		Result.clean();
	}
}
