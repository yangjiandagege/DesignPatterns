package com.intel.yj.designpatterns;


import com.intel.yj.designpatterns.abstractfactory.AbstractFactoryApp;
import com.intel.yj.designpatterns.adapter.AdapterApp;
import com.intel.yj.designpatterns.bridge.BridgeApp;
import com.intel.yj.designpatterns.builder.BuilderApp;
import com.intel.yj.designpatterns.businessdelegate.BusinessDelegateApp;
import com.intel.yj.designpatterns.callback.CallbackApp;
import com.intel.yj.designpatterns.chainofresponsibility.ChainOfResponsibilityApp;
import com.intel.yj.designpatterns.command.CommandApp;
import com.intel.yj.designpatterns.composite.CompositeApp;
import com.intel.yj.designpatterns.dao.DataAccessObjectApp;
import com.intel.yj.designpatterns.decorator.DecoratorApp;
import com.intel.yj.designpatterns.facade.FacadeApp;
import com.intel.yj.designpatterns.factory.FactoryApp;
import com.intel.yj.designpatterns.factorymethod.FactoryMethodApp;
import com.intel.yj.designpatterns.filter.FilterApp;
import com.intel.yj.designpatterns.fyweight.FlyweightApp;
import com.intel.yj.designpatterns.interpreter.InterpreterApp;
import com.intel.yj.designpatterns.iterator.IteratorApp;
import com.intel.yj.designpatterns.mediator.MediatorApp;
import com.intel.yj.designpatterns.memento.MementoApp;
import com.intel.yj.designpatterns.mvc.ModelViewControllerApp;
import com.intel.yj.designpatterns.nullobject.NullObjectApp;
import com.intel.yj.designpatterns.observer.ObserverApp;
import com.intel.yj.designpatterns.prototype.PrototypeApp;
import com.intel.yj.designpatterns.proxy.ProxyApp;
import com.intel.yj.designpatterns.singleton.SingletonApp;
import com.intel.yj.designpatterns.state.StateApp;
import com.intel.yj.designpatterns.strategy.StrategyApp;
import com.intel.yj.designpatterns.template.TemplateApp;
import com.intel.yj.designpatterns.threadpool.ThreadPoolApp;
import com.intel.yj.designpatterns.visitor.VisitorApp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity{
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
