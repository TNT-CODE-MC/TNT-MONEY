/*
    Author: .GuTeK <wiktor@tntcode.pl>
    Project: TNT-MONEY [https://tntcode.pl/plugins/TNT-MONEY]
    Resources: 1/1600
    Date: 23.05.2022
    Contact Discord: .GuTeK#5326
    Contact e-mail: wiktor@tntcode.pl
    Our Websites: https://tntnetwork.pl / https://tntcode.pl
    ⓒ 2022 by .GuTeK | ALL RIGHTS RESERVED |
*/

package GuTeK.activation.registries;

import java.util.Vector;

class LineTokenizer {
    private int currentPosition;
    private int maxPosition;
    private String str;
    private Vector stack;
    private static final String singles = "=";

    public LineTokenizer(final String str) {
        this.stack = new Vector();
        this.currentPosition = 0;
        this.str = str;
        this.maxPosition = str.length();
    }

    private void skipWhiteSpace() {
        while (this.currentPosition < this.maxPosition && Character.isWhitespace(this.str.charAt(this.currentPosition))) {
            ++this.currentPosition;
        }
    }

    public boolean hasMoreTokens() {
        if (this.stack.size() > 0) {
            return true;
        }
        this.skipWhiteSpace();
        return this.currentPosition < this.maxPosition;
    }

    public String nextToken() {
        final int size = this.stack.size();
        if (size > 0) {
            final String t = this.stack.elementAt(size - 1);
        }
    }
}
