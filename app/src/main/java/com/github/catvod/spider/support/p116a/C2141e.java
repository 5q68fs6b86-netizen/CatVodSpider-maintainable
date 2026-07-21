package com.github.catvod.spider.support.p116a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p116a.e */
/* JADX INFO: loaded from: classes.dex */
final class C2141e implements Closeable {

    /* JADX INFO: renamed from: a */
    private final File f5014a;

    /* JADX INFO: renamed from: b */
    private final long f5015b;

    /* JADX INFO: renamed from: c */
    private final File f5016c;

    /* JADX INFO: renamed from: d */
    private final RandomAccessFile f5017d;

    /* JADX INFO: renamed from: e */
    private final FileChannel f5018e;

    /* JADX INFO: renamed from: f */
    private final FileLock f5019f;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p116a.e$a */
    private static class a extends File {

        /* JADX INFO: renamed from: a */
        public long f5020a;

        public a(File file, String str) {
            super(file, str);
            this.f5020a = -1L;
        }
    }

    C2141e(File file, File file2) {
        StringBuilder sbM5396a = C2137a.m5396a("MultiDexExtractor(");
        sbM5396a.append(file.getPath());
        sbM5396a.append(", ");
        sbM5396a.append(file2.getPath());
        sbM5396a.append(")");
        Log.i("MultiDex", sbM5396a.toString());
        this.f5014a = file;
        this.f5016c = file2;
        this.f5015b = m5412d(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f5017d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f5018e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f5019f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m5409a(this.f5018e);
                throw e;
            } catch (Error e2) {
                /*e=e2*/
                m5409a(this.f5018e);
                throw e;
            } catch (RuntimeException e3) {
                /*e=e3*/
                m5409a(this.f5018e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m5409a(this.f5017d);
            throw e4;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5409a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m5410b(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(C2139c.m5408a("tmp-", str), ".zip", file.getParentFile());
        StringBuilder sbM5396a = C2137a.m5396a("Extracting ");
        sbM5396a.append(fileCreateTempFile.getPath());
        Log.i("MultiDex", sbM5396a.toString());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, i);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    m5409a(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            m5409a(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    private static long m5411c(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    /* JADX INFO: renamed from: d */
    private static long m5412d(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            C2142f.a aVarM5417a = C2142f.m5417a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = aVarM5417a.f5022b;
            randomAccessFile.seek(aVarM5417a.f5021a);
            int iMin = (int) Math.min(16384L, j);
            byte[] bArr = new byte[16384];
            while (true) {
                int i = randomAccessFile.read(bArr, 0, iMin);
                if (i == -1) {
                    break;
                }
                crc32.update(bArr, 0, i);
                j -= (long) i;
                if (j == 0) {
                    break;
                }
                iMin = (int) Math.min(16384L, j);
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    private List m5413f(Context context) throws IOException {
        C2141e c2141e = this;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = c2141e.f5014a.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            a aVar = new a(c2141e.f5016c, str + i2 + ".zip");
            if (!aVar.isFile()) {
                StringBuilder sbM5396a = C2137a.m5396a("Missing extracted secondary dex file '");
                sbM5396a.append(aVar.getPath());
                sbM5396a.append("'");
                throw new IOException(sbM5396a.toString());
            }
            aVar.f5020a = m5412d(aVar);
            long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
            long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
            long jLastModified = aVar.lastModified();
            if (j2 == jLastModified) {
                String str2 = str;
                if (j == aVar.f5020a) {
                    arrayList.add(aVar);
                    i2++;
                    c2141e = this;
                    str = str2;
                }
            }
            throw new IOException("Invalid extracted dex: " + aVar + " (key \"\"), expected modification time: " + j2 + ", modification time: " + jLastModified + ", expected crc: " + j + ", file crc: " + aVar.f5020a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private List<a> m5414g() {
        String str = this.f5014a.getName() + ".classes";
        File[] fileArrListFiles = this.f5016c.listFiles(new C2140d());
        if (fileArrListFiles == null) {
            StringBuilder sbM5396a = C2137a.m5396a("Failed to list secondary dex dir content (");
            sbM5396a.append(this.f5016c.getPath());
            sbM5396a.append(").");
            Log.w("MultiDex", sbM5396a.toString());
        } else {
            for (File file : fileArrListFiles) {
                StringBuilder sbM5396a2 = C2137a.m5396a("Trying to delete old file ");
                sbM5396a2.append(file.getPath());
                sbM5396a2.append(" of size ");
                sbM5396a2.append(file.length());
                Log.i("MultiDex", sbM5396a2.toString());
                if (file.delete()) {
                    StringBuilder sbM5396a3 = C2137a.m5396a("Deleted old file ");
                    sbM5396a3.append(file.getPath());
                    Log.i("MultiDex", sbM5396a3.toString());
                } else {
                    StringBuilder sbM5396a4 = C2137a.m5396a("Failed to delete old file ");
                    sbM5396a4.append(file.getPath());
                    Log.w("MultiDex", sbM5396a4.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f5014a);
        int i = 2;
        String str2 = "classes2.dex";
        while (true) {
            try {
                ZipEntry entry = zipFile.getEntry(str2);
                if (entry == null) {
                    try {
                        zipFile.close();
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to close resource", e);
                    }
                    return arrayList;
                }
                a aVar = new a(this.f5016c, str + i + ".zip");
                arrayList.add(aVar);
                Log.i("MultiDex", "Extraction is needed for file " + aVar);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    m5410b(zipFile, entry, aVar, str);
                    try {
                        aVar.f5020a = m5412d(aVar);
                        z = true;
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to read crc from " + aVar.getAbsolutePath(), e2);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(aVar.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(aVar.length());
                    sb.append(" - crc: ");
                    sb.append(aVar.f5020a);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        aVar.delete();
                        if (aVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + aVar.getPath() + "'");
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + aVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                str2 = "classes" + i + ".dex";
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (IOException e3) {
                    Log.w("MultiDex", "Failed to close resource", e3);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m5415h(Context context, long j, long j2, List list) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j);
        editorEdit.putLong("crc", j2);
        editorEdit.putInt("dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            editorEdit.putLong("dex.crc." + i, aVar.f5020a);
            editorEdit.putLong("dex.time." + i, aVar.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5019f.release();
        this.f5018e.close();
        this.f5017d.close();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX INFO: renamed from: e */
    final List m5416e(Context context, boolean z) {
        String str;
        List<a> listM5413f;
        StringBuilder sbM5396a = C2137a.m5396a("MultiDexExtractor.load(");
        sbM5396a.append(this.f5014a.getPath());
        sbM5396a.append(", ");
        sbM5396a.append(z);
        sbM5396a.append(", ");
        sbM5396a.append("");
        sbM5396a.append(")");
        Log.i("MultiDex", sbM5396a.toString());
        if (!this.f5019f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z) {
            if (z) {
                str = "Forced extraction must be performed.";
            } else {
                str = "Detected that extraction must be performed.";
            }
            Log.i("MultiDex", str);
            List<a> listM5414g = m5414g();
            m5415h(context, m5411c(this.f5014a), this.f5015b, listM5414g);
            listM5413f = listM5414g;
        } else {
            File file = this.f5014a;
            long j = this.f5015b;
            SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
            if ((sharedPreferences.getLong("timestamp", -1L) == m5411c(file) && sharedPreferences.getLong("crc", -1L) == j) ? false : true) {
                if (z) {
                    str = "Forced extraction must be performed.";
                } else {
                    str = "Detected that extraction must be performed.";
                }
                Log.i("MultiDex", str);
            } else {
                try {
                    listM5413f = m5413f(context);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    List<a> listM5414g2 = m5414g();
                    m5415h(context, m5411c(this.f5014a), this.f5015b, listM5414g2);
                    listM5413f = listM5414g2;
                }
            }
            List<a> listM5414g3 = m5414g();
            m5415h(context, m5411c(this.f5014a), this.f5015b, listM5414g3);
            listM5413f = listM5414g3;
        }
        StringBuilder sbM5396a2 = C2137a.m5396a("load found ");
        sbM5396a2.append(listM5413f.size());
        sbM5396a2.append(" secondary dex files");
        Log.i("MultiDex", sbM5396a2.toString());
        return listM5413f;
    }
}
