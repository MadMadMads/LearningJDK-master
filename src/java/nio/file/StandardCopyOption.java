/*
 * Copyright (c) 2007, 2009, Oracle and/or its affiliates. All rights reserved.
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

package java.nio.file;

/**
 * Defines the standard copy options.
 *
 * @since 1.7
 */
// 文件复制/移动操作的标准可选参数
public enum StandardCopyOption implements CopyOption {
    
    /**
     * Replace an existing file if it exists.
     */
    REPLACE_EXISTING,   // 允许覆盖已存在的文件(不能覆盖目录)
    
    /**
     * Copy attributes to the new file.
     */
    COPY_ATTRIBUTES,    // 复制(安全)属性信息
    
    /**
     * Move the file as an atomic file system operation.
     */
    ATOMIC_MOVE;        // 原子地移动(禁止在不同的磁盘间复制)
    
}
