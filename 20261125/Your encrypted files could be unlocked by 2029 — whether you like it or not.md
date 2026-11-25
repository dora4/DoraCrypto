# Your encrypted files could be unlocked by 2029 — whether you like it or not

**— Google warns the countdown to "Quantum Apocalypse" is just three years away. Are your files still safe?**

You may have heard the term **"Quantum Apocalypse"**.

It is not a line from a sci-fi movie. It is a serious milestone discussed by cryptographers: the moment quantum computers become powerful enough to break today’s public-key cryptography algorithms.

In 2026, Google released a security report that moved this timeline forward to **2029**.

Three years.

The report also laid out a specific projection: a sufficiently capable quantum computer could cut the time needed to crack Bitcoin’s encryption to roughly 9 minutes. Around 6.9 million Bitcoins would be put at risk.

Just 9 minutes to break an encryption system trusted by tens of millions of people worldwide.

If that number feels abstract, think of this: it takes about 8 minutes to walk from your office to the subway station. In that short span, the encryption shielding your wallet address may already be broken.

---

## This article is not here to stoke fear

Quantum computers are not yet able to crack RSA-2048. The consensus across academia and industry is that the threat is real, though the timeline remains uncertain. Some say 2029, some 2035, and others argue it will not arrive until 2040.

I will not debate exactly when fault-tolerant quantum computers will materialize. Because compared with this future threat, there is an ongoing risk that deserves your immediate attention:

**Harvest Now, Decrypt Later.**

This describes the most unsettling tactic in data security in 2026.

Its logic is simple:

Attackers do not need to break your encryption right now. They only need to do one thing — **save your ciphertext.** They will store it and wait until quantum computing matures, then decrypt it.

The fact your ciphertext cannot be opened today does not mean it will stay locked three years from now, five years from now, or ten years from now.

**The critical point: your ciphertext may already have been stolen today.**

You just do not know it.

---

## "Harvesting" is already happening

On October 30, 2026, Binance, the world’s largest cryptocurrency exchange, confirmed a security incident involving approximately 6.3 billion US dollars in assets. Around 3 billion USD was frozen on-chain, while the rest flowed into anonymous addresses.

In November 2026, unauthorized third parties accessed parts of Rakuten Securities’ Tokyo headquarters systems. The breach initially affected roughly 11.25 million customer accounts; that figure later rose to 15.72 million. Exposed records included names, residential addresses, annual income, financial assets and bank account numbers.

On November 16, 2026, websites belonging to 178 organizations globally were compromised via an Optimizely vulnerability. Attackers injected malicious code purpose-built to steal crypto wallet data, bank card details and browser history.

These incidents share one key trait: **a large portion of the stolen data was stored in encrypted form.**

Rakuten Securities’ financial records were encrypted. Card data intercepted in the Optimizely attack was encrypted in transit. On-chain assets on Binance are inherently protected by cryptographic signatures.

But attackers do not care. They take the ciphertext, along with fragments from key management systems. It may be useless today. It may be useless tomorrow. But they keep it.

**A ciphertext’s value does not depend on whether it can be decrypted today. It depends on how long it is stored — and how patient whoever holds it is.**

On the dark web, "encrypted databases" sell for far less than plaintext databases — yet trading volumes keep rising. Buyers are not betting on today. They are betting on tomorrow.

This is the business model behind Harvest Now, Decrypt Later: acquire ciphertext cheaply, wait until quantum computing or new exploits turn ciphertext into readable plaintext, then cash out at peak value.

Your encrypted data today is someone else’s option contract for the next decade.

---

## So what kind of encryption is truly secure?

Most encryption solutions on the market rest on an unspoken assumption: **keys and ciphertext can be stored separately, but can be reunited when needed.**

Your cloud storage says "your files are encrypted". But decryption keys sit on the provider’s servers — so the service can automatically decrypt files when you open them. Your password manager says "your data is encrypted". But the hash of your master password is kept on the provider’s systems — so they can verify your identity.

These systems are safe *today*. They may not be once quantum computers arrive.

Because keys, however well protected, reside on reachable systems. Given enough patience and time, attackers can eventually bring ciphertext and keys together.

**Harvest Now, Decrypt Later attacks target exactly this reunion point.**

Attackers do not need to know your key right now. They only need to capture both your ciphertext and information about where keys are stored — then wait for quantum computers to piece them together.

That is why DoraBox has adopted a design many see as overly extreme:

**Your key never leaves your device.**

Not "encrypted and stored on our secure servers". Not "guarded by our hardware security modules". It stays on your phone or computer, inside a secure enclave accessible only by your operating system, with no remote interface that can retrieve it.

DoraBox’s servers hold none of your keys. The DoraBox development team holds none of your keys. No person, server or piece of code on Earth can retrieve your key without your knowledge.

What does this mean?

**It means even if attackers steal your ciphertext, they can never pair it with your key — because the key lives in an offline, physically isolated location.**

Quantum computers arrive? Fine. Give them the ciphertext. Without the key, all a quantum computer sees is random bytes.

---

## Another radical design: brute-force attempts end not in data leakage, but data erasure

DoraBox has another feature that divides security consultants:

**After a configurable number of consecutive incorrect password attempts, encrypted data is automatically destroyed.**

Not locked. Not suspended. Destroyed. The key is permanently wiped from the local secure enclave, turning ciphertext into unintelligible noise forever.

Some call this too drastic. "What if I forget my password?"

DoraBox’s response: your data has only two possible outcomes. Only you can read it, or no one can read it. **There is no scenario where others can access it while you cannot.**

Under traditional security models, forgetting your password means contacting support for a reset. Support verifies your identity using phone number, email or security questions and issues you a new key.

But this password-recovery channel is also attackers’ favourite attack surface. Social engineering attacks in 2026 can perfectly mimic your voice, identity details and behavioural patterns. If a recovery channel exists, attackers will exploit it.

DoraBox removes that channel entirely.

**You are responsible for your password. Lose it, and your data is gone. But at the very least, it will not end up on the dark web.**

It is a trade-off. DoraBox believes that for highly sensitive data — seed phrases, ID photos, trade secrets — permanent erasure is vastly preferable to falling into hostile hands.

---

## Your choice in three years’ time

In 2029. If Google’s forecast holds, quantum computers will gain the capability to crack today’s public-key encryption that year.

Where will your files, photos, contracts and seed phrases be then?

If they sit on cloud provider servers, encrypted under a model where the provider holds the keys — their safety hinges on whether attackers harvested your ciphertext in these three years.

If they are on a USB drive protected by conventional AES encryption with no zero-knowledge architecture — their safety depends on whether the drive was ever lost, or your computer ever compromised.

If they are stored in DoraBox: keys local to your device, ciphertext never passing through third parties, brute-force attempts triggering automatic erasure — then its security rests on just one thing:

**Whether you remember your password.**

Three years is not long. But enough can happen.

Long enough for a data theft to turn into a decryption. Long enough for a ciphertext bundle on the dark web to find its buyer. Long enough for a file you dismiss as trivial today to become a ticking time bomb in 2029.

**Or long enough for you to make a choice you will not regret three years from now.**

---

Your safe is not built to stop thieves today. It is built to defend against tomorrow’s quantum computers.

Is yours strong enough?