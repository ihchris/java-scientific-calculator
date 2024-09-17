@Override
public void keyPressed(KeyEvent e) {
    int keyCode = e.getKeyCode();
    String command = "";

    switch (keyCode) {
        case KeyEvent.VK_0:
        case KeyEvent.VK_NUMPAD0:
            command = "0";
            break;
        case KeyEvent.VK_1:
        case KeyEvent.VK_NUMPAD1:
            command = "1";
            break;
        case KeyEvent.VK_2:
        case KeyEvent.VK_NUMPAD2:
            command = "2";
            break;
        case KeyEvent.VK_3:
        case KeyEvent.VK_NUMPAD3:
            command = "3";
            break;
        case KeyEvent.VK_4:
        case KeyEvent.VK_NUMPAD4:
            command = "4";
            break;
        case KeyEvent.VK_5:
        case KeyEvent.VK_NUMPAD5:
            command = "5";
            break;
        case KeyEvent.VK_6:
        case KeyEvent.VK_NUMPAD6:
            command = "6";
            break;
        case KeyEvent.VK_7:
        case KeyEvent.VK_NUMPAD7:
            command = "7";
            break;
        case KeyEvent.VK_8:
        case KeyEvent.VK_NUMPAD8:
            command = "8";
            break;
        case KeyEvent.VK_9:
        case KeyEvent.VK_NUMPAD9:
            command = "9";
            break;
        case KeyEvent.VK_PERIOD:
        case KeyEvent.VK_DECIMAL:
            command = ".";
            break;
        case KeyEvent.VK_PLUS:
        case KeyEvent.VK_ADD:
            command = "+";
            break;
        case KeyEvent.VK_MINUS:
        case KeyEvent.VK_SUBTRACT:
            command = "-";
            break;
        case KeyEvent.VK_MULTIPLY:
            command = "*";
            break;
        case KeyEvent.VK_DIVIDE:
            command = "/";
            break;
        case KeyEvent.VK_ENTER:
            command = "=";
            break;
        case KeyEvent.VK_BACK_SPACE:
            command = "C";
            break;
    }

    handleInput(command);
}
