import java.util.Deque;
import java.util.LinkedList;

public class TextEditor {
  // Word: append(), undo(), redo()
  private String text;
  private Deque<String> undoStack;
  private Deque<String> redoStack;

  public TextEditor() {
    this.text = "";
    this.undoStack = new LinkedList<>();
    this.redoStack = new LinkedList<>();
  }

  public void append(String newText) {
    this.undoStack.push(this.text); 
    this.text += newText;
  }

  public void undo() {
    if(this.undoStack.isEmpty()){
      System.out.println("you can not undo");
      this.redoStack.push(this.text);
    }
    }


  public void redo() {
    this.undoStack.push(this.text);
    this.text= redoStack.pop();
  }

  @Override
  public String toString() {
    return this.text;
  }

  public static void main(String[] args) {
    TextEditor editor = new TextEditor();
    editor.append("Hello");  // undoStack: "", this.text = Hello
    editor.append(" World"); // undoStack: "Hello", "", this.text = Hello World
    editor.append("!"); // undoStack: "Hello World", "Hello"  this.text = Hello World!
    

    editor.undo();
    editor.undo();
    editor.undo();
    
    System.out.println(editor);
  }

}