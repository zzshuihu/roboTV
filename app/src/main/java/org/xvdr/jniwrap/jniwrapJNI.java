/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xvdr.jniwrap;

public class jniwrapJNI {
  public final static native long new_Packet__SWIG_0(int jarg1, int jarg2, long jarg3);
  public final static native long new_Packet__SWIG_1(int jarg1, int jarg2);
  public final static native long new_Packet__SWIG_2(int jarg1);
  public final static native long new_Packet__SWIG_3();
  public final static native void delete_Packet(long jarg1);
  public final static native void Packet_createUid(long jarg1, Packet jarg1_);
  public final static native boolean Packet_putString(long jarg1, Packet jarg1_, String jarg2);
  public final static native boolean Packet_putU8(long jarg1, Packet jarg1_, short jarg2);
  public final static native boolean Packet_putU16(long jarg1, Packet jarg1_, int jarg2);
  public final static native boolean Packet_putS16(long jarg1, Packet jarg1_, short jarg2);
  public final static native boolean Packet_putU32(long jarg1, Packet jarg1_, long jarg2);
  public final static native boolean Packet_putS32(long jarg1, Packet jarg1_, int jarg2);
  public final static native boolean Packet_putU64(long jarg1, Packet jarg1_, java.math.BigInteger jarg2);
  public final static native boolean Packet_putS64(long jarg1, Packet jarg1_, long jarg2);
  public final static native void Packet_clear(long jarg1, Packet jarg1_);
  public final static native void Packet_rewind(long jarg1, Packet jarg1_);
  public final static native String Packet_getString(long jarg1, Packet jarg1_);
  public final static native short Packet_getU8(long jarg1, Packet jarg1_);
  public final static native int Packet_getU16(long jarg1, Packet jarg1_);
  public final static native short Packet_getS16(long jarg1, Packet jarg1_);
  public final static native long Packet_getU32(long jarg1, Packet jarg1_);
  public final static native int Packet_getS32(long jarg1, Packet jarg1_);
  public final static native java.math.BigInteger Packet_getU64(long jarg1, Packet jarg1_);
  public final static native long Packet_getS64(long jarg1, Packet jarg1_);
  public final static native void Packet_setClientID(long jarg1, Packet jarg1_, int jarg2);
  public final static native int Packet_getClientID(long jarg1, Packet jarg1_);
  public final static native boolean Packet_eop(long jarg1, Packet jarg1_);
  public final static native void Packet_freeze(long jarg1, Packet jarg1_);
  public final static native long Packet_getPacketLength(long jarg1, Packet jarg1_);
  public final static native long Packet_getPayloadLength(long jarg1, Packet jarg1_);
  public final static native long Packet_getUID(long jarg1, Packet jarg1_);
  public final static native int Packet_getMsgID(long jarg1, Packet jarg1_);
  public final static native int Packet_getType(long jarg1, Packet jarg1_);
  public final static native long Packet_getCheckSum(long jarg1, Packet jarg1_);
  public final static native long Packet_getPayloadCheckSum(long jarg1, Packet jarg1_);
  public final static native void Packet_disablePayloadCheckSum(long jarg1, Packet jarg1_);
  public final static native int Packet_getProtocolVersion(long jarg1, Packet jarg1_);
  public final static native void Packet_setProtocolVersion(long jarg1, Packet jarg1_, int jarg2);
  public final static native void Packet_setMsgID(long jarg1, Packet jarg1_, int jarg2);
  public final static native void Packet_setType(long jarg1, Packet jarg1_, int jarg2);
  public final static native boolean Packet_compress(long jarg1, Packet jarg1_, int jarg2);
  public final static native boolean Packet_isCompressed(long jarg1, Packet jarg1_);
  public final static native boolean Packet_uncompress(long jarg1, Packet jarg1_);
  public final static native void Packet_print(long jarg1, Packet jarg1_);
  public final static native void Packet_copy(long jarg1, Packet jarg1_, long jarg2, Packet jarg2_);
  public final static native int Packet_remaining(long jarg1, Packet jarg1_);
  public final static native int Packet_headerLength_get();
  public final static native int Packet_checkSumPos_get();
  public final static native int Packet_uncompressedPayloadLengthPos_get();
  public final static native int Packet_payloadLengthPos_get();
  public final static native int Packet_payloadCheckSumPos_get();
  public final static native int Packet_protocolVersionPos_get();
  public final static native int Packet_clientIDPos_get();
  public final static native int Packet_typePos_get();
  public final static native int Packet_msgIDPos_get();
  public final static native int Packet_uIDPos_get();
  public final static native int Packet_syncPos_get();
  public final static native void Packet_skipBuffer(long jarg1, Packet jarg1_, int jarg2);
  public final static native void Packet_readBuffer(long jarg1, Packet jarg1_, byte[] jarg2, int jarg3, int jarg4);
  public final static native void Packet_writeBuffer(long jarg1, Packet jarg1_, byte[] jarg2, int jarg3, int jarg4);
  public final static native long new_Connection();
  public final static native void delete_Connection(long jarg1);
  public final static native boolean Connection_open(long jarg1, Connection jarg1_, String jarg2, int jarg3);
  public final static native void Connection_abort(long jarg1, Connection jarg1_);
  public final static native boolean Connection_close(long jarg1, Connection jarg1_);
  public final static native boolean Connection_isOpen(long jarg1, Connection jarg1_);
  public final static native boolean Connection_isAborting(long jarg1, Connection jarg1_);
  public final static native boolean Connection_sendRequest(long jarg1, Connection jarg1_, long jarg2, Packet jarg2_);
  public final static native long Connection_readResponse__SWIG_0(long jarg1, Connection jarg1_);
  public final static native boolean Connection_readResponse__SWIG_1(long jarg1, Connection jarg1_, long jarg2, Packet jarg2_);
  public final static native long Connection_transmitMessage__SWIG_0(long jarg1, Connection jarg1_, long jarg2, Packet jarg2_);
  public final static native boolean Connection_transmitMessage__SWIG_1(long jarg1, Connection jarg1_, long jarg2, Packet jarg2_, long jarg3, Packet jarg3_);
  public final static native void Connection_setTimeout(long jarg1, Connection jarg1_, int jarg2);
  public final static native String Connection_getHostname(long jarg1, Connection jarg1_);
  public final static native void Connection_setPriority(long jarg1, Connection jarg1_, int jarg2);
  public final static native int Connection_getPriority(long jarg1, Connection jarg1_);
  public final static native long new_SessionProxy();
  public final static native void delete_SessionProxy(long jarg1);
  public final static native boolean SessionProxy_open(long jarg1, SessionProxy jarg1_, String jarg2, int jarg3);
  public final static native boolean SessionProxy_close(long jarg1, SessionProxy jarg1_);
  public final static native boolean SessionProxy_terminate(long jarg1, SessionProxy jarg1_);
  public final static native long SessionProxy_transmitMessage__SWIG_0(long jarg1, SessionProxy jarg1_, long jarg2, Packet jarg2_);
  public final static native boolean SessionProxy_transmitMessage__SWIG_1(long jarg1, SessionProxy jarg1_, long jarg2, Packet jarg2_, long jarg3, Packet jarg3_);
  public final static native void delete_SessionListener(long jarg1);
  public final static native void SessionListener_onNotification(long jarg1, SessionListener jarg1_, long jarg2, Packet jarg2_);
  public final static native void SessionListener_onDisconnect(long jarg1, SessionListener jarg1_);
  public final static native void SessionListener_onReconnect(long jarg1, SessionListener jarg1_);
  public final static native long new_SessionListener();
  public final static native void SessionListener_director_connect(SessionListener obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void SessionListener_change_ownership(SessionListener obj, long cptr, boolean take_or_release);
  public final static native long new_Session();
  public final static native void delete_Session(long jarg1);
  public final static native void Session_setCallback(long jarg1, Session jarg1_, long jarg2, SessionListener jarg2_);


static {
	try {
		System.loadLibrary("msgexchange");
		System.loadLibrary("jniwrap");
	}
	catch (UnsatisfiedLinkError e) {
		e.printStackTrace();
	}
}

  public final static native long SessionProxy_SWIGUpcast(long jarg1);
  public final static native long Session_SWIGUpcast(long jarg1);

  public static void SwigDirector_SessionListener_onNotification(SessionListener jself, long p) {
    jself.onNotification((p == 0) ? null : new Packet(p, false));
  }
  public static void SwigDirector_SessionListener_onDisconnect(SessionListener jself) {
    jself.onDisconnect();
  }
  public static void SwigDirector_SessionListener_onReconnect(SessionListener jself) {
    jself.onReconnect();
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
