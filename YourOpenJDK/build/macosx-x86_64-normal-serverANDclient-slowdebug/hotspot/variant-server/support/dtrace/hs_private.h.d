# 1 "/Users/chenyongda/YourOpenJDK/hotspot/src/os/posix/dtrace/hs_private.d"
# 1 "<built-in>" 1
# 1 "<built-in>" 3
# 331 "<built-in>" 3
# 1 "<command line>" 1
# 1 "<built-in>" 2
# 1 "/Users/chenyongda/YourOpenJDK/hotspot/src/os/posix/dtrace/hs_private.d" 2
# 25 "/Users/chenyongda/YourOpenJDK/hotspot/src/os/posix/dtrace/hs_private.d"
provider hs_private {
  probe safepoint__begin();
  probe safepoint__end();
  probe cms__initmark__begin();
  probe cms__initmark__end();
  probe cms__remark__begin();
  probe cms__remark__end();
};

#pragma D attributes Private/Private/Common provider hs_private provider
#pragma D attributes Private/Private/Unknown provider hs_private module
#pragma D attributes Private/Private/Unknown provider hs_private function
#pragma D attributes Private/Private/Common provider hs_private name
#pragma D attributes Private/Private/Common provider hs_private args

