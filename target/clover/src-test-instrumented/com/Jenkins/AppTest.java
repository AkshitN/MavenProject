/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package com.Jenkins;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{static class __CLR4_3_122kbq73gqz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0041\u006b\u0073\u0068\u0069\u0074\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u004d\u0061\u0076\u0065\u006e\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u005c\u005c\u004d\u0061\u0076\u0065\u006e\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1592811927171L,8589935092L,8,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );__CLR4_3_122kbq73gqz.R.inc(3);try{__CLR4_3_122kbq73gqz.R.inc(2);
    }finally{__CLR4_3_122kbq73gqz.R.flushNeeded();}}

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {try{__CLR4_3_122kbq73gqz.R.inc(4);
        __CLR4_3_122kbq73gqz.R.inc(5);return new TestSuite( AppTest.class );
    }finally{__CLR4_3_122kbq73gqz.R.flushNeeded();}}

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {__CLR4_3_122kbq73gqz.R.globalSliceStart(getClass().getName(),6);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_119jc7q6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_122kbq73gqz.R.rethrow($CLV_t2$);}finally{__CLR4_3_122kbq73gqz.R.globalSliceEnd(getClass().getName(),"com.Jenkins.AppTest.testApp",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),6,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_119jc7q6(){try{__CLR4_3_122kbq73gqz.R.inc(6);
        __CLR4_3_122kbq73gqz.R.inc(7);assertTrue( true );
    }finally{__CLR4_3_122kbq73gqz.R.flushNeeded();}}
}
