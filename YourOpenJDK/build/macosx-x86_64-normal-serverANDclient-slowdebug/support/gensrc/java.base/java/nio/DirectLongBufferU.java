/*
 * Copyright (c) 2000, 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

// -- This file was mechanically generated: Do not edit! -- //

package java.nio;

import java.io.FileDescriptor;
import jdk.internal.misc.Unsafe;
import jdk.internal.misc.VM;
import jdk.internal.ref.Cleaner;
import sun.nio.ch.DirectBuffer;


class DirectLongBufferU

    extends LongBuffer



    implements DirectBuffer
{



    // Cached unsafe-access object
    protected static final Unsafe unsafe = Bits.unsafe();

    // Cached array base offset
    private static final long arrayBaseOffset = (long)unsafe.arrayBaseOffset(long[].class);

    // Cached unaligned-access capability
    protected static final boolean unaligned = Bits.unaligned();

    // Base address, used in all indexing calculations
    // NOTE: moved up to Buffer.java for speed in JNI GetDirectBufferAddress
    //    protected long address;

    // An object attached to this buffer. If this buffer is a view of another
    // buffer then we use this field to keep a reference to that buffer to
    // ensure that its memory isn't freed before we are done with it.
    private final Object att;

    public Object attachment() {
        return att;
    }






































    public Cleaner cleaner() { return null; }


















































































    // For duplicates and slices
    //
    DirectLongBufferU(DirectBuffer db,         // package-private
                               int mark, int pos, int lim, int cap,
                               int off)
    {

        super(mark, pos, lim, cap);
        address = db.address() + off;



        att = db;




    }

    public LongBuffer slice() {
        int pos = this.position();
        int lim = this.limit();
        assert (pos <= lim);
        int rem = (pos <= lim ? lim - pos : 0);
        int off = (pos << 3);
        assert (off >= 0);
        return new DirectLongBufferU(this, -1, 0, rem, rem, off);
    }










    public LongBuffer duplicate() {
        return new DirectLongBufferU(this,
                                              this.markValue(),
                                              this.position(),
                                              this.limit(),
                                              this.capacity(),
                                              0);
    }

    public LongBuffer asReadOnlyBuffer() {

        return new DirectLongBufferRU(this,
                                           this.markValue(),
                                           this.position(),
                                           this.limit(),
                                           this.capacity(),
                                           0);



    }



    public long address() {
        return address;
    }

    private long ix(int i) {
        return address + ((long)i << 3);
    }

    public long get() {
        return ((unsafe.getLong(ix(nextGetIndex()))));
    }

    public long get(int i) {
        return ((unsafe.getLong(ix(checkIndex(i)))));
    }







    public LongBuffer get(long[] dst, int offset, int length) {

        if (((long)length << 3) > Bits.JNI_COPY_TO_ARRAY_THRESHOLD) {
            checkBounds(offset, length, dst.length);
            int pos = position();
            int lim = limit();
            assert (pos <= lim);
            int rem = (pos <= lim ? lim - pos : 0);
            if (length > rem)
                throw new BufferUnderflowException();

            long dstOffset = arrayBaseOffset + ((long)offset << 3);

            if (order() != ByteOrder.nativeOrder())
                unsafe.copySwapMemory(null,
                                      ix(pos),
                                      dst,
                                      dstOffset,
                                      (long)length << 3,
                                      (long)1 << 3);
            else

                unsafe.copyMemory(null,
                                  ix(pos),
                                  dst,
                                  dstOffset,
                                  (long)length << 3);
            position(pos + length);
        } else {
            super.get(dst, offset, length);
        }
        return this;



    }



    public LongBuffer put(long x) {

        unsafe.putLong(ix(nextPutIndex()), ((x)));
        return this;



    }

    public LongBuffer put(int i, long x) {

        unsafe.putLong(ix(checkIndex(i)), ((x)));
        return this;



    }

    public LongBuffer put(LongBuffer src) {

        if (src instanceof DirectLongBufferU) {
            if (src == this)
                throw createSameBufferException();
            DirectLongBufferU sb = (DirectLongBufferU)src;

            int spos = sb.position();
            int slim = sb.limit();
            assert (spos <= slim);
            int srem = (spos <= slim ? slim - spos : 0);

            int pos = position();
            int lim = limit();
            assert (pos <= lim);
            int rem = (pos <= lim ? lim - pos : 0);

            if (srem > rem)
                throw new BufferOverflowException();
            unsafe.copyMemory(sb.ix(spos), ix(pos), (long)srem << 3);
            sb.position(spos + srem);
            position(pos + srem);
        } else if (src.hb != null) {

            int spos = src.position();
            int slim = src.limit();
            assert (spos <= slim);
            int srem = (spos <= slim ? slim - spos : 0);

            put(src.hb, src.offset + spos, srem);
            src.position(spos + srem);

        } else {
            super.put(src);
        }
        return this;



    }

    public LongBuffer put(long[] src, int offset, int length) {

        if (((long)length << 3) > Bits.JNI_COPY_FROM_ARRAY_THRESHOLD) {
            checkBounds(offset, length, src.length);
            int pos = position();
            int lim = limit();
            assert (pos <= lim);
            int rem = (pos <= lim ? lim - pos : 0);
            if (length > rem)
                throw new BufferOverflowException();

            long srcOffset = arrayBaseOffset + ((long)offset << 3);

            if (order() != ByteOrder.nativeOrder())
                unsafe.copySwapMemory(src,
                                      srcOffset,
                                      null,
                                      ix(pos),
                                      (long)length << 3,
                                      (long)1 << 3);
            else

                unsafe.copyMemory(src,
                                  srcOffset,
                                  null,
                                  ix(pos),
                                  (long)length << 3);
            position(pos + length);
        } else {
            super.put(src, offset, length);
        }
        return this;



    }

    public LongBuffer compact() {

        int pos = position();
        int lim = limit();
        assert (pos <= lim);
        int rem = (pos <= lim ? lim - pos : 0);

        unsafe.copyMemory(ix(pos), ix(0), (long)rem << 3);
        position(rem);
        limit(capacity());
        discardMark();
        return this;



    }

    public boolean isDirect() {
        return true;
    }

    public boolean isReadOnly() {
        return false;
    }















































    public ByteOrder order() {





        return ((ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN)
                ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);

    }


























}